package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextItalic24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextItalic24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 4f)
            horizontalLineToRelative(8.504f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.648f, 0.742f)
            lineTo(18.254f, 5.5f)
            horizontalLineToRelative(-3.197f)
            lineToRelative(-5.02f, 13f)
            horizontalLineToRelative(4.213f)
            curveToRelative(0.38f, 0f, 0.693f, 0.282f, 0.742f, 0.648f)
            lineTo(15f, 19.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(14.25f, 20f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.414f, 0f, -0.746f, -0.336f, -0.746f, -0.75f)
            curveToRelative(0f, -0.38f, 0.28f, -0.694f, 0.645f, -0.743f)
            lineTo(4.75f, 18.5f)
            horizontalLineToRelative(3.685f)
            lineToRelative(0.021f, -0.065f)
            lineTo(13.45f, 5.499f)
            horizontalLineToRelative(-3.7f)
            curveToRelative(-0.379f, 0f, -0.693f, -0.282f, -0.742f, -0.648f)
            lineTo(9f, 4.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(9.751f, 4f)
            horizontalLineToRelative(8.503f)
            horizontalLineToRelative(-8.503f)
            close()
        }
    }.build()
}

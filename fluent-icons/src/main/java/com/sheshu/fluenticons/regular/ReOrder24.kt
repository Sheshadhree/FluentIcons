package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ReOrder24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrder24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 13.25f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 14.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14.75f, 2f, 14.414f, 2f, 14f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 13.25f)
            horizontalLineToRelative(18.5f)
            horizontalLineToRelative(-18.5f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(18.5f)
            curveTo(21.664f, 9.25f, 22f, 9.586f, 22f, 10f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 10.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.75f, 2f, 10.414f, 2f, 10f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 9.25f)
            horizontalLineToRelative(18.5f)
            horizontalLineToRelative(-18.5f)
            close()
        }
    }.build()
}

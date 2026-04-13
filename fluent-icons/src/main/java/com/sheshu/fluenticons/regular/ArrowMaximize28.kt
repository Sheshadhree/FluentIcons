package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowMaximize28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMaximize28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.25f, 4f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(24f, 4.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(22.5f, 12.75f)
            verticalLineTo(6.56f)
            lineTo(6.56f, 22.5f)
            horizontalLineToRelative(6.19f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(13.5f, 23.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(12.75f, 24f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(4f, 23.25f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(5.5f, 15.25f)
            verticalLineToRelative(6.189f)
            lineTo(21.439f, 5.5f)
            horizontalLineTo(15.25f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(14.5f, 4.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(15.25f, 4f)
            horizontalLineToRelative(8f)
            close()
        }
    }.build()
}

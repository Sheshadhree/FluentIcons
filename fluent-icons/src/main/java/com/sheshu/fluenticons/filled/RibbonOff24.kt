package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.454f, 6.515f)
            curveTo(5.161f, 7.287f, 5f, 8.125f, 5f, 9f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            curveToRelative(0.875f, 0f, 1.713f, -0.16f, 2.485f, -0.454f)
            lineToRelative(0.766f, 0.766f)
            curveTo(14.258f, 16.754f, 13.158f, 17f, 12f, 17f)
            curveToRelative(-1.892f, 0f, -3.63f, -0.657f, -5f, -1.754f)
            lineToRelative(0.003f, 6f)
            curveToRelative(0f, 0.607f, 0.684f, 0.962f, 1.181f, 0.612f)
            lineToRelative(3.817f, -2.687f)
            lineToRelative(3.818f, 2.687f)
            curveToRelative(0.497f, 0.35f, 1.182f, -0.005f, 1.182f, -0.613f)
            verticalLineToRelative(-3.183f)
            lineToRelative(3.718f, 3.718f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.234f, 3.235f)
            close()
            moveTo(7.142f, 3.96f)
            lineToRelative(9.898f, 9.898f)
            curveTo(18.253f, 12.599f, 19f, 10.887f, 19f, 9f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            curveToRelative(-1.887f, 0f, -3.6f, 0.746f, -4.858f, 1.96f)
            close()
        }
    }.build()
}

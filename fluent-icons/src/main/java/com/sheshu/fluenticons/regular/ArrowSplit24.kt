package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSplit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSplit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(2.496f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(6.192f)
            lineToRelative(1.725f, -1.723f)
            curveToRelative(0.293f, -0.292f, 0.768f, -0.292f, 1.06f, 0.001f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(-3.005f, 3.001f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.294f, -0.294f, -0.294f, -0.768f, 0f, -1.061f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.72f, 1.72f)
            verticalLineToRelative(-6.19f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(8.751f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(6.19f)
            lineToRelative(1.72f, -1.72f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.293f, 0.294f, -0.768f, 0.294f, -1.06f, 0f)
            lineToRelative(-3.001f, -3f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(6f, 18.44f)
            verticalLineToRelative(-6.19f)
            curveTo(6f, 10.731f, 7.233f, 9.5f, 8.75f, 9.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(3.75f)
            curveTo(11.25f, 3.336f, 11.587f, 3f, 12f, 3f)
            close()
        }
    }.build()
}

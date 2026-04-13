package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnLeftDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnLeftDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.22f, 10.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4f, 4f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(8.5f, 13.44f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6.25f)
            curveTo(16.664f, 5.5f, 17f, 5.164f, 17f, 4.75f)
            reflectiveCurveTo(16.664f, 4f, 16.25f, 4f)
            horizontalLineTo(10f)
            curveTo(8.343f, 4f, 7f, 5.343f, 7f, 7f)
            verticalLineToRelative(6.44f)
            lineToRelative(-2.72f, -2.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            close()
        }
    }.build()
}

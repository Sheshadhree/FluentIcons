package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.848f, 0.85f)
            curveTo(2.408f, 4.805f, 2f, 5.729f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 19.321f, 3.679f, 21f, 5.75f, 21f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.296f)
            curveToRelative(0f, 1.427f, 1.617f, 2.254f, 2.774f, 1.419f)
            lineTo(16.309f, 21f)
            horizontalLineToRelative(3.63f)
            lineToRelative(4.78f, 4.78f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(6.182f, 3f)
            lineToRelative(17.65f, 17.65f)
            curveToRelative(1.28f, -0.596f, 2.168f, -1.894f, 2.168f, -3.4f)
            verticalLineTo(6.75f)
            curveTo(26f, 4.679f, 24.321f, 3f, 22.25f, 3f)
            horizontalLineTo(6.182f)
            close()
        }
    }.build()
}

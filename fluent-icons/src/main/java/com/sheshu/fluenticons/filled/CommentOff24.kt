package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.702f, 0.702f)
            curveTo(2.352f, 4.568f, 2f, 5.368f, 2f, 6.25f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 1.03f, 1.176f, 1.618f, 2f, 1f)
            lineTo(13f, 18f)
            horizontalLineToRelative(3.939f)
            lineToRelative(3.78f, 3.78f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(22f, 14.75f)
            curveToRelative(0f, 1.107f, -0.553f, 2.084f, -1.398f, 2.67f)
            lineTo(6.182f, 3f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
            verticalLineToRelative(8.5f)
            close()
        }
    }.build()
}

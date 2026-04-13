package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.293f, 12f)
            lineToRelative(2.853f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(0.739f, 0.738f)
            curveTo(1.343f, 3.05f, 1f, 3.735f, 1f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.942f)
            curveToRelative(0f, 0.842f, 0.992f, 1.292f, 1.625f, 0.738f)
            lineTo(8.688f, 12f)
            horizontalLineToRelative(2.605f)
            close()
            moveTo(15f, 9.5f)
            curveToRelative(0f, 0.916f, -0.492f, 1.716f, -1.227f, 2.152f)
            lineTo(4.121f, 2f)
            horizontalLineTo(12.5f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}

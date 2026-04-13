package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHoverOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHoverOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.293f, 13f)
            lineToRelative(1.853f, 1.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.242f, 1.241f)
            curveTo(1.583f, 3.354f, 1f, 4.11f, 1f, 5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.229f, 0.052f, -0.448f, 0.146f, -0.646f)
            lineTo(8f, 8.707f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.215f, 0.138f, 0.406f, 0.342f, 0.474f)
            curveTo(8.546f, 15.042f, 8.77f, 14.972f, 8.9f, 14.8f)
            lineToRelative(1.35f, -1.8f)
            horizontalLineToRelative(2.043f)
            close()
            moveToRelative(1.612f, -1.216f)
            curveTo(14.555f, 11.454f, 15f, 10.779f, 15f, 10f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5.121f)
            lineToRelative(8.784f, 8.784f)
            close()
        }
    }.build()
}

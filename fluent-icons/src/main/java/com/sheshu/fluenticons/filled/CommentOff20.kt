package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(2.91f, 3.615f)
            curveTo(2.353f, 4.087f, 2f, 4.787f, 2f, 5.566f)
            verticalLineToRelative(6.71f)
            curveToRelative(0f, 1.418f, 1.164f, 2.566f, 2.6f, 2.566f)
            horizontalLineToRelative(0.6f)
            verticalLineToRelative(2.171f)
            curveToRelative(0f, 0.213f, 0.07f, 0.42f, 0.2f, 0.591f)
            curveToRelative(0.33f, 0.437f, 0.957f, 0.526f, 1.399f, 0.2f)
            lineToRelative(4.011f, -2.962f)
            horizontalLineToRelative(3.325f)
            lineToRelative(3.011f, 3.012f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2.309f, -2.308f)
            lineTo(3.823f, 3.116f)
            lineToRelative(-0.97f, -0.97f)
            close()
            moveTo(18f, 12.277f)
            curveToRelative(0f, 0.97f, -0.546f, 1.814f, -1.351f, 2.25f)
            lineTo(5.12f, 3f)
            horizontalLineTo(15.4f)
            curveTo(16.836f, 3f, 18f, 4.149f, 18f, 5.566f)
            verticalLineToRelative(6.71f)
            close()
        }
    }.build()
}

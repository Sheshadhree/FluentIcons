package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cursor16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cursor16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.002f, 2.999f)
            curveToRelative(0f, -0.825f, 0.94f, -1.295f, 1.6f, -0.8f)
            lineTo(13.6f, 8.2f)
            curveTo(14.368f, 8.777f, 13.96f, 10f, 13f, 10f)
            horizontalLineTo(9.053f)
            curveToRelative(-0.31f, 0f, -0.604f, 0.144f, -0.793f, 0.391f)
            lineToRelative(-2.466f, 3.214f)
            curveToRelative(-0.581f, 0.758f, -1.793f, 0.347f, -1.793f, -0.609f)
            verticalLineTo(3f)
            close()
            moveToRelative(8.997f, 6f)
            lineTo(5.002f, 3f)
            verticalLineToRelative(9.997f)
            lineToRelative(2.465f, -3.213f)
            curveTo(7.846f, 9.289f, 8.432f, 9f, 9.054f, 9f)
            horizontalLineTo(13f)
            close()
        }
    }.build()
}

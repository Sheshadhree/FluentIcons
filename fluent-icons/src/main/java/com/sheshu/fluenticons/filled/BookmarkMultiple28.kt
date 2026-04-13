package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.401f, 3.5f)
            curveTo(8.921f, 2.603f, 9.89f, 2f, 11f, 2f)
            horizontalLineToRelative(6.75f)
            curveTo(20.65f, 2f, 23f, 4.35f, 23f, 7.25f)
            verticalLineTo(20f)
            curveToRelative(0f, 1.11f, -0.603f, 2.08f, -1.5f, 2.599f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(8.401f)
            close()
            moveTo(5f, 8f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(9f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(17.25f)
            curveToRelative(0f, 0.277f, -0.152f, 0.53f, -0.396f, 0.661f)
            curveToRelative(-0.244f, 0.13f, -0.54f, 0.116f, -0.77f, -0.037f)
            lineTo(12.5f, 21.651f)
            lineToRelative(-6.334f, 4.223f)
            curveToRelative(-0.23f, 0.154f, -0.526f, 0.168f, -0.77f, 0.037f)
            curveTo(5.152f, 25.781f, 5f, 25.527f, 5f, 25.25f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

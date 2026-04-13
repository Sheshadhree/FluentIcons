package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentSquare28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSquare28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.422f, 3f)
            curveToRelative(0.73f, 0f, 1.429f, 0.29f, 1.944f, 0.806f)
            lineToRelative(6.828f, 6.828f)
            curveTo(24.71f, 11.149f, 25f, 11.849f, 25f, 12.578f)
            verticalLineToRelative(9.672f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 25f, 3f, 23.769f, 3f, 22.25f)
            verticalLineTo(5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineToRelative(9.672f)
            close()
            moveTo(5.75f, 4.5f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(13f)
            horizontalLineToRelative(-5.75f)
            curveTo(16.231f, 13f, 15f, 11.769f, 15f, 10.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(5.75f)
            close()
            moveToRelative(10.75f, 5.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.19f)
            lineTo(16.5f, 5.06f)
            verticalLineToRelative(5.19f)
            close()
        }
    }.build()
}

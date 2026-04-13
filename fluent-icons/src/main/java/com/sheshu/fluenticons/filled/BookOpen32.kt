package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookOpen32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(19.5f)
            curveTo(2f, 26.993f, 3.007f, 28f, 4.25f, 28f)
            horizontalLineToRelative(8f)
            curveToRelative(1.524f, 0f, 2.88f, -0.718f, 3.75f, -1.834f)
            curveTo(16.87f, 27.282f, 18.226f, 28f, 19.75f, 28f)
            horizontalLineToRelative(8f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(30f, 5.007f, 28.993f, 4f, 27.75f, 4f)
            horizontalLineToRelative(-8f)
            curveTo(18.226f, 4f, 16.87f, 4.718f, 16f, 5.834f)
            curveTo(15.13f, 4.718f, 13.774f, 4f, 12.25f, 4f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(4.5f, 25.5f)
            verticalLineToRelative(-19f)
            horizontalLineToRelative(7.75f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.5f)
            close()
            moveToRelative(13f, -16.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(7.75f)
            verticalLineToRelative(19f)
            horizontalLineToRelative(-7.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(8.75f)
            close()
        }
    }.build()
}

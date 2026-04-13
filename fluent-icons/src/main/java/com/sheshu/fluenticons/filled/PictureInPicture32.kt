package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PictureInPicture32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PictureInPicture32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28f, 17f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-9f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(9f)
            close()
            moveTo(25.5f, 3f)
            curveTo(27.985f, 3f, 30f, 5.015f, 30f, 7.5f)
            verticalLineToRelative(8.468f)
            curveToRelative(-0.602f, -0.3f, -1.282f, -0.468f, -2f, -0.468f)
            horizontalLineToRelative(-9f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-8f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-15f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            horizontalLineToRelative(19f)
            close()
        }
    }.build()
}

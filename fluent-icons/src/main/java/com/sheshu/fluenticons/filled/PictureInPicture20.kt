package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PictureInPicture20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PictureInPicture20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 3f)
            curveTo(3.231f, 3f, 2f, 4.231f, 2f, 5.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 13.769f, 3.231f, 15f, 4.75f, 15f)
            horizontalLineTo(9f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.171f, 0f, 0.338f, 0.017f, 0.5f, 0.05f)
            verticalLineToRelative(-4.3f)
            curveTo(18f, 4.231f, 16.769f, 3f, 15.25f, 3f)
            horizontalLineTo(4.75f)
            close()
            moveTo(18f, 11.085f)
            curveTo(17.844f, 11.03f, 17.675f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.653f, -0.417f, -1.209f, -1f, -1.415f)
            close()
        }
    }.build()
}

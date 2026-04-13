package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WindowShield20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowShield20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3.507f)
            curveToRelative(-0.373f, -0.171f, -0.715f, -0.414f, -1f, -0.661f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4.576f)
            curveToRelative(0.19f, 0.374f, 0.416f, 0.706f, 0.66f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(11.88f, 3.16f)
            curveToRelative(0.508f, 0.532f, 1.484f, 1.379f, 2.684f, 1.552f)
            curveTo(17.803f, 10.747f, 18f, 10.946f, 18f, 11.194f)
            verticalLineToRelative(2.323f)
            curveToRelative(0f, 3.122f, -2.784f, 4.255f, -3.386f, 4.463f)
            curveToRelative(-0.075f, 0.026f, -0.152f, 0.026f, -0.228f, 0f)
            curveTo(13.785f, 17.772f, 11f, 16.64f, 11f, 13.517f)
            verticalLineToRelative(-2.323f)
            curveToRelative(0f, -0.248f, 0.197f, -0.447f, 0.436f, -0.482f)
            curveToRelative(1.2f, -0.173f, 2.175f, -1.02f, 2.683f, -1.553f)
            curveToRelative(0.202f, -0.212f, 0.56f, -0.212f, 0.762f, 0f)
            close()
        }
    }.build()
}

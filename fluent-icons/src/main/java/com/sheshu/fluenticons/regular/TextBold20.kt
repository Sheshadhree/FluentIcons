package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBold20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBold20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.56f, 6.06f, 3f, 6.75f, 3f)
            horizontalLineToRelative(3.501f)
            curveToRelative(2.403f, 0f, 3.999f, 1.988f, 3.999f, 4f)
            curveToRelative(0f, 0.872f, -0.3f, 1.738f, -0.834f, 2.44f)
            curveToRelative(0.904f, 0.703f, 1.581f, 1.802f, 1.581f, 3.31f)
            curveToRelative(0f, 2.863f, -2.437f, 4.245f, -4.244f, 4.245f)
            horizontalLineTo(6.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(4.25f)
            close()
            moveTo(8f, 11f)
            verticalLineToRelative(3.495f)
            horizontalLineToRelative(2.753f)
            curveToRelative(0.811f, 0f, 1.744f, -0.618f, 1.744f, -1.745f)
            curveToRelative(0f, -1.129f, -0.937f, -1.75f, -1.744f, -1.75f)
            horizontalLineTo(8f)
            close()
            moveToRelative(0f, -2.5f)
            horizontalLineToRelative(2.248f)
            curveToRelative(0.882f, 0f, 1.502f, -0.721f, 1.502f, -1.5f)
            curveToRelative(0f, -0.78f, -0.62f, -1.5f, -1.499f, -1.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}

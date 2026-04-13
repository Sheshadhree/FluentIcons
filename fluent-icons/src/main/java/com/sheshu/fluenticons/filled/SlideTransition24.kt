package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideTransition24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTransition24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(6.5f, 5.5f)
            verticalLineToRelative(13f)
            horizontalLineTo(5f)
            verticalLineToRelative(-13f)
            horizontalLineToRelative(1.5f)
            close()
            moveToRelative(4f, 13f)
            horizontalLineTo(9f)
            verticalLineToRelative(-13f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(13f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineTo(14f)
            verticalLineToRelative(-13f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(13f)
            close()
        }
    }.build()
}

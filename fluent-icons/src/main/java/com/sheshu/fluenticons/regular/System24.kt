package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.System24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.System24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 5f)
            horizontalLineToRelative(14.5f)
            curveTo(20.769f, 5f, 22f, 6.231f, 22f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 19f, 2f, 17.769f, 2f, 16.25f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 6.231f, 3.231f, 5f, 4.75f, 5f)
            close()
            moveToRelative(0f, 1.5f)
            curveTo(4.06f, 6.5f, 3.5f, 7.06f, 3.5f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(4.75f)
            close()
        }
    }.build()
}

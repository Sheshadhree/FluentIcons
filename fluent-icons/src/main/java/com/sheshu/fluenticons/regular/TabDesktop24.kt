package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabDesktop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineToRelative(12.5f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(11f, 4.5f)
            verticalLineToRelative(1.25f)
            curveTo(11f, 6.993f, 12.007f, 8f, 13.25f, 8f)
            horizontalLineToRelative(6.25f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(5.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineTo(11f)
            close()
            moveToRelative(8.5f, 2f)
            horizontalLineToRelative(-6.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(5.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}

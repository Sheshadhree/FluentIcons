package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.75f)
            curveTo(2f, 5.127f, 4.127f, 3f, 6.75f, 3f)
            horizontalLineToRelative(10f)
            curveTo(17.993f, 3f, 19f, 4.007f, 19f, 5.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(7.75f)
            curveTo(5.955f, 5.5f, 4.5f, 6.955f, 4.5f, 8.75f)
            verticalLineTo(17f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 17f, 2f, 15.993f, 2f, 14.75f)
            verticalLineToRelative(-7f)
            close()
            moveTo(7.75f, 6.5f)
            curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(12f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-12f)
            close()
        }
    }.build()
}

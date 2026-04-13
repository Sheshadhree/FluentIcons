package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.127f, 3f, 2f, 5.127f, 2f, 7.75f)
            verticalLineToRelative(7f)
            curveTo(2f, 15.993f, 3.007f, 17f, 4.25f, 17f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineTo(4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(10f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(5.5f)
            horizontalLineTo(19f)
            verticalLineTo(5.25f)
            curveTo(19f, 4.007f, 17.993f, 3f, 16.75f, 3f)
            horizontalLineToRelative(-10f)
            close()
            moveToRelative(1f, 3.5f)
            curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(12f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-12f)
            close()
            moveTo(7f, 8.75f)
            curveTo(7f, 8.336f, 7.336f, 8f, 7.75f, 8f)
            horizontalLineToRelative(12f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-12f)
            curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
            verticalLineToRelative(-9.5f)
            close()
        }
    }.build()
}

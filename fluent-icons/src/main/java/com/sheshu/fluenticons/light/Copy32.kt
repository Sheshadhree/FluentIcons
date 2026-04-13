package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Copy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Copy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 2f)
            curveTo(9.455f, 2f, 8f, 3.455f, 8f, 5.25f)
            verticalLineToRelative(18.5f)
            curveTo(8f, 25.545f, 9.455f, 27f, 11.25f, 27f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
            horizontalLineToRelative(-12.5f)
            close()
            moveTo(9f, 5.25f)
            curveTo(9f, 4.007f, 10.007f, 3f, 11.25f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(24.993f, 3f, 26f, 4.007f, 26f, 5.25f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-12.5f)
            curveTo(10.007f, 26f, 9f, 24.993f, 9f, 23.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(6f, 5.905f)
            curveTo(5.384f, 6.496f, 5f, 7.328f, 5f, 8.25f)
            verticalLineToRelative(15.5f)
            curveTo(5f, 27.202f, 7.798f, 30f, 11.25f, 30f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.922f, 0f, 1.754f, -0.384f, 2.345f, -1f)
            horizontalLineTo(11.25f)
            curveTo(8.35f, 29f, 6f, 26.65f, 6f, 23.75f)
            verticalLineTo(5.905f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SelectAllOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SelectAllOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(9f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9f)
            curveTo(18.5f, 4.455f, 17.045f, 3f, 15.25f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(4.5f, 6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(9f)
            curveTo(16.216f, 4.5f, 17f, 5.284f, 17f, 6.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-9f)
            close()
            moveTo(6.01f, 19.5f)
            curveTo(6.589f, 20.402f, 7.6f, 21f, 8.75f, 21f)
            horizontalLineToRelative(7f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.15f, -0.598f, -2.161f, -1.5f, -2.739f)
            verticalLineToRelative(9.74f)
            curveToRelative(0f, 2.07f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-7f)
            lineTo(8.724f, 19.5f)
            horizontalLineTo(6.011f)
            close()
        }
    }.build()
}

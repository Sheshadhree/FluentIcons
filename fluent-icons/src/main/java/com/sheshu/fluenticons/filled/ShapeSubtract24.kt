package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeSubtract24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeSubtract24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.905f)
            curveTo(2.384f, 3.496f, 2f, 4.328f, 2f, 5.25f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.1f, 0.005f, 0.2f, 0.013f, 0.297f)
            curveToRelative(0.047f, 0.514f, 0.213f, 0.993f, 0.47f, 1.41f)
            curveToRelative(0.023f, 0.037f, 0.047f, 0.074f, 0.072f, 0.11f)
            curveTo(3.139f, 15.932f, 4.128f, 16.5f, 5.25f, 16.5f)
            horizontalLineTo(7.5f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(8f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.25f)
            curveTo(16.5f, 3.455f, 15.045f, 2f, 13.25f, 2f)
            horizontalLineToRelative(-8f)
            curveTo(4.377f, 2f, 3.584f, 2.344f, 3f, 2.905f)
            close()
            moveToRelative(6f, 7.845f)
            curveTo(9f, 9.784f, 9.784f, 9f, 10.75f, 9f)
            horizontalLineToRelative(8f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8f)
            curveTo(9.784f, 20.5f, 9f, 19.716f, 9f, 18.75f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}

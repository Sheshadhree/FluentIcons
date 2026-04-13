package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(6f, 2.448f, 6f, 3f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            curveTo(2.448f, 6f, 2f, 6.448f, 2f, 7f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(9.75f)
            curveTo(6f, 20.097f, 7.903f, 22f, 10.25f, 22f)
            horizontalLineTo(20f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 20f, 8f, 18.993f, 8f, 17.75f)
            verticalLineTo(3f)
            close()
            moveToRelative(12f, 7.25f)
            verticalLineTo(19f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-8.75f)
            curveTo(22f, 7.903f, 20.097f, 6f, 17.75f, 6f)
            horizontalLineTo(9f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(8.75f)
            curveTo(18.993f, 8f, 20f, 9.007f, 20f, 10.25f)
            close()
        }
    }.build()
}

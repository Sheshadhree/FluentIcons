package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1.75f)
            curveTo(5f, 1.336f, 4.664f, 1f, 4.25f, 1f)
            reflectiveCurveTo(3.5f, 1.336f, 3.5f, 1.75f)
            verticalLineTo(3.5f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 3.5f, 1f, 3.836f, 1f, 4.25f)
            reflectiveCurveTo(1.336f, 5f, 1.75f, 5f)
            horizontalLineTo(3.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineTo(11f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(12.5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.664f, 11f, 14.25f, 11f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 11f, 5f, 10.328f, 5f, 9.5f)
            verticalLineTo(1.75f)
            close()
            moveToRelative(6f, 4.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            verticalLineTo(5f)
            horizontalLineToRelative(3.5f)
            curveTo(10.328f, 5f, 11f, 5.672f, 11f, 6.5f)
            close()
        }
    }.build()
}

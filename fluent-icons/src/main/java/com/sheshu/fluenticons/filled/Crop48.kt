package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5.5f)
            curveTo(14f, 4.672f, 13.328f, 4f, 12.5f, 4f)
            reflectiveCurveTo(11f, 4.672f, 11f, 5.5f)
            verticalLineTo(11f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 11f, 4f, 11.672f, 4f, 12.5f)
            reflectiveCurveTo(4.672f, 14f, 5.5f, 14f)
            horizontalLineTo(11f)
            verticalLineToRelative(16.25f)
            curveToRelative(0f, 3.728f, 3.022f, 6.75f, 6.75f, 6.75f)
            horizontalLineTo(34f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(37f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(43.328f, 34f, 42.5f, 34f)
            horizontalLineTo(17.75f)
            curveTo(15.679f, 34f, 14f, 32.321f, 14f, 30.25f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(20f, 12.25f)
            verticalLineTo(32f)
            horizontalLineToRelative(3f)
            verticalLineTo(17.75f)
            curveToRelative(0f, -3.728f, -3.022f, -6.75f, -6.75f, -6.75f)
            horizontalLineTo(16f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(14.25f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            close()
        }
    }.build()
}

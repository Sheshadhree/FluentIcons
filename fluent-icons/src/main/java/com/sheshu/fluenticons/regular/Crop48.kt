package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5.25f)
            curveTo(14f, 4.56f, 13.44f, 4f, 12.75f, 4f)
            reflectiveCurveTo(11.5f, 4.56f, 11.5f, 5.25f)
            verticalLineToRelative(6.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 11.5f, 4f, 12.06f, 4f, 12.75f)
            reflectiveCurveTo(4.56f, 14f, 5.25f, 14f)
            horizontalLineToRelative(6.25f)
            verticalLineToRelative(16.25f)
            curveToRelative(0f, 3.452f, 2.798f, 6.25f, 6.25f, 6.25f)
            horizontalLineTo(34f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(36.5f)
            horizontalLineToRelative(6.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(43.44f, 34f, 42.75f, 34f)
            horizontalLineToRelative(-25f)
            curveTo(15.679f, 34f, 14f, 32.321f, 14f, 30.25f)
            verticalLineToRelative(-25f)
            close()
            moveToRelative(20f, 12.5f)
            verticalLineTo(32f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(17.75f)
            curveToRelative(0f, -3.452f, -2.798f, -6.25f, -6.25f, -6.25f)
            horizontalLineTo(16f)
            verticalLineTo(14f)
            horizontalLineToRelative(14.25f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            close()
        }
    }.build()
}

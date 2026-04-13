package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2.75f)
            curveTo(8f, 2.336f, 7.664f, 2f, 7.25f, 2f)
            reflectiveCurveTo(6.5f, 2.336f, 6.5f, 2.75f)
            verticalLineTo(6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.836f, 2f, 7.25f)
            reflectiveCurveTo(2.336f, 8f, 2.75f, 8f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(20f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(21.5f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(25.664f, 20f, 25.25f, 20f)
            horizontalLineToRelative(-15f)
            curveTo(9.007f, 20f, 8f, 18.993f, 8f, 17.75f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(12f, 7.5f)
            verticalLineTo(19f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-8.75f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            horizontalLineToRelative(8.75f)
            curveTo(18.993f, 8f, 20f, 9.007f, 20f, 10.25f)
            close()
        }
    }.build()
}

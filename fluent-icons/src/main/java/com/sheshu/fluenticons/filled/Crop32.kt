package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 3.25f)
            curveTo(9f, 2.56f, 8.44f, 2f, 7.75f, 2f)
            reflectiveCurveTo(6.5f, 2.56f, 6.5f, 3.25f)
            verticalLineTo(6.5f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 6.5f, 2f, 7.06f, 2f, 7.75f)
            reflectiveCurveTo(2.56f, 9f, 3.25f, 9f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineTo(23f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(25.5f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(29.44f, 23f, 28.75f, 23f)
            horizontalLineTo(11.5f)
            curveTo(10.12f, 23f, 9f, 21.88f, 9f, 20.5f)
            verticalLineTo(3.25f)
            close()
            moveToRelative(14f, 8.25f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineToRelative(-10f)
            verticalLineTo(9f)
            horizontalLineToRelative(10f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}

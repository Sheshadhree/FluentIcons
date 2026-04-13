package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BeakerEmpty16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BeakerEmpty16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.56f, 11.74f)
            lineTo(10.95f, 9f)
            lineToRelative(-0.61f, -1.05f)
            curveTo(10.12f, 7.57f, 10f, 7.13f, 10f, 6.69f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(10.78f, 3f, 11f, 2.78f, 11f, 2.5f)
            reflectiveCurveTo(10.78f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(5.22f, 2f, 5f, 2.22f, 5f, 2.5f)
            reflectiveCurveTo(5.22f, 3f, 5.5f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.69f)
            curveToRelative(0f, 0.44f, -0.12f, 0.88f, -0.34f, 1.26f)
            lineTo(5.05f, 9f)
            lineToRelative(-1.61f, 2.74f)
            curveToRelative(-0.58f, 1f, 0.14f, 2.26f, 1.3f, 2.26f)
            horizontalLineToRelative(6.52f)
            curveToRelative(1.16f, 0f, 1.88f, -1.26f, 1.3f, -2.26f)
            close()
            moveTo(11.26f, 13f)
            horizontalLineTo(4.74f)
            curveToRelative(-0.39f, 0f, -0.63f, -0.42f, -0.43f, -0.75f)
            lineTo(5.62f, 10f)
            lineTo(6.2f, 9f)
            lineToRelative(0.32f, -0.55f)
            curveTo(6.84f, 7.92f, 7f, 7.31f, 7f, 6.69f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.69f)
            curveToRelative(0f, 0.62f, 0.16f, 1.23f, 0.48f, 1.76f)
            lineTo(9.8f, 9f)
            lineToRelative(0.58f, 1f)
            lineToRelative(1.31f, 2.25f)
            curveToRelative(0.19f, 0.33f, -0.05f, 0.75f, -0.43f, 0.75f)
            close()
        }
    }.build()
}

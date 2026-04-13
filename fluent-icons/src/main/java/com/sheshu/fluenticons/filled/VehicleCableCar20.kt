package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VehicleCableCar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleCableCar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.434f, 3.004f)
            curveToRelative(0.274f, -0.036f, 0.525f, 0.156f, 0.562f, 0.43f)
            curveToRelative(0.036f, 0.274f, -0.156f, 0.525f, -0.43f, 0.562f)
            lineTo(12f, 4.738f)
            verticalLineTo(6f)
            curveToRelative(0f, 0.768f, -0.289f, 1.47f, -0.764f, 2f)
            horizontalLineTo(13f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            horizontalLineTo(4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4.871f)
            lineTo(2.566f, 5.996f)
            curveTo(2.292f, 6.032f, 2.041f, 5.84f, 2.004f, 5.566f)
            curveTo(1.968f, 5.292f, 2.16f, 5.041f, 2.434f, 5.004f)
            lineTo(11f, 3.862f)
            verticalLineTo(3.5f)
            curveTo(11f, 3.224f, 11.224f, 3f, 11.5f, 3f)
            reflectiveCurveTo(12f, 3.224f, 12f, 3.5f)
            verticalLineToRelative(0.23f)
            lineToRelative(5.434f, -0.725f)
            close()
            moveTo(16f, 14f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(12f)
            close()
        }
    }.build()
}

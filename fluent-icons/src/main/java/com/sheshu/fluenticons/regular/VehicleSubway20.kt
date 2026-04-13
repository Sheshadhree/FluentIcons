package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VehicleSubway20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VehicleSubway20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14f)
            curveToRelative(0f, 0.552f, -0.447f, 1f, -1f, 1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(5f, 1f)
            curveToRelative(0.553f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.447f, -1f, -1f, -1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(8.5f, 5f)
            curveTo(8.224f, 5f, 8f, 5.224f, 8f, 5.5f)
            reflectiveCurveTo(8.224f, 6f, 8.5f, 6f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 6f, 12f, 5.776f, 12f, 5.5f)
            reflectiveCurveTo(11.776f, 5f, 11.5f, 5f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.55f, -1.174f, 2.824f, -2.681f, 2.983f)
            lineToRelative(2.384f, 1.06f)
            curveToRelative(0.253f, 0.112f, 0.366f, 0.408f, 0.254f, 0.66f)
            curveToRelative(-0.112f, 0.252f, -0.407f, 0.366f, -0.66f, 0.254f)
            lineTo(11.894f, 17f)
            horizontalLineTo(8.106f)
            lineToRelative(-4.403f, 1.957f)
            curveToRelative(-0.252f, 0.112f, -0.548f, -0.002f, -0.66f, -0.254f)
            curveToRelative(-0.112f, -0.252f, 0.002f, -0.548f, 0.254f, -0.66f)
            lineToRelative(2.385f, -1.06f)
            curveTo(4.175f, 16.824f, 3f, 15.55f, 3f, 14f)
            verticalLineTo(6f)
            close()
            moveToRelative(9.012f, 10f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-2f)
            horizontalLineTo(4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(6.012f)
            close()
            moveTo(4f, 6f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(12f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 4f, 4f, 4.895f, 4f, 6f)
            close()
        }
    }.build()
}

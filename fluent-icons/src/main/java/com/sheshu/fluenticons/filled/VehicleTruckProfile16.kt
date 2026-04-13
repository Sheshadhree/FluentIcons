package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VehicleTruckProfile16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleTruckProfile16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(5.5f)
            curveTo(10.217f, 2f, 11f, 2.784f, 11f, 3.75f)
            verticalLineTo(4f)
            horizontalLineToRelative(0.382f)
            curveToRelative(0.568f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineToRelative(1.118f, 2.235f)
            curveTo(13.946f, 7.273f, 14f, 7.503f, 14f, 7.736f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.563f)
            curveTo(11.715f, 13.363f, 10.932f, 14f, 10f, 14f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineTo(6.937f)
            curveTo(6.715f, 13.363f, 5.932f, 14f, 5f, 14f)
            curveToRelative(-0.987f, 0f, -1.807f, -0.715f, -1.97f, -1.655f)
            curveTo(2.423f, 12.071f, 2f, 11.46f, 2f, 10.75f)
            verticalLineToRelative(-7f)
            close()
            moveTo(11f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.691f)
            lineToRelative(-0.862f, -1.724f)
            curveTo(11.744f, 5.107f, 11.571f, 5f, 11.382f, 5f)
            horizontalLineTo(11f)
            close()
            moveToRelative(-6f, 6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(4f, 1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            close()
        }
    }.build()
}

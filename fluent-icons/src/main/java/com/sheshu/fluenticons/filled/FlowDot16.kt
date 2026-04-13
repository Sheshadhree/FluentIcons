package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlowDot16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlowDot16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2.25f)
            curveToRelative(0.555f, 0f, 1.038f, 0.302f, 1.298f, 0.75f)
            horizontalLineToRelative(6.452f)
            curveTo(12.769f, 3f, 14f, 4.231f, 14f, 5.75f)
            reflectiveCurveTo(12.769f, 8.5f, 11.25f, 8.5f)
            horizontalLineToRelative(-6.5f)
            curveTo(4.06f, 8.5f, 3.5f, 9.06f, 3.5f, 9.75f)
            reflectiveCurveTo(4.06f, 11f, 4.75f, 11f)
            horizontalLineToRelative(6.452f)
            curveToRelative(0.26f, -0.448f, 0.743f, -0.75f, 1.298f, -0.75f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.555f, 0f, -1.038f, -0.302f, -1.298f, -0.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 12.5f, 2f, 11.269f, 2f, 9.75f)
            reflectiveCurveTo(3.231f, 7f, 4.75f, 7f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(11.94f, 4.5f, 11.25f, 4.5f)
            horizontalLineTo(4.798f)
            curveTo(4.538f, 4.948f, 4.055f, 5.25f, 3.5f, 5.25f)
            curveTo(2.672f, 5.25f, 2f, 4.578f, 2f, 3.75f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.build()
}

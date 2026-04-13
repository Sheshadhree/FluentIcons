package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Briefcase16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Briefcase16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 11.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 14f, 1f, 12.88f, 1f, 11.5f)
            verticalLineTo(8.947f)
            curveTo(1.635f, 9.597f, 2.52f, 10f, 3.5f, 10f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.5f)
            curveTo(7f, 10.776f, 7.224f, 11f, 7.5f, 11f)
            horizontalLineToRelative(1f)
            curveTo(8.776f, 11f, 9f, 10.776f, 9f, 10.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.98f, 0f, 1.865f, -0.404f, 2.5f, -1.053f)
            verticalLineTo(11.5f)
            close()
            moveTo(9.25f, 1f)
            curveTo(10.216f, 1f, 11f, 1.784f, 11f, 2.75f)
            verticalLineTo(4f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.294f, 0f, 2.36f, 0.984f, 2.487f, 2.244f)
            curveTo(14.996f, 6.328f, 15f, 6.414f, 15f, 6.5f)
            curveTo(15f, 7.88f, 13.88f, 9f, 12.5f, 9f)
            horizontalLineTo(9f)
            verticalLineTo(8.5f)
            curveTo(9f, 8.224f, 8.776f, 8f, 8.5f, 8f)
            horizontalLineToRelative(-1f)
            curveTo(7.224f, 8f, 7f, 8.224f, 7f, 8.5f)
            verticalLineTo(9f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 9f, 1f, 7.88f, 1f, 6.5f)
            reflectiveCurveTo(2.12f, 4f, 3.5f, 4f)
            horizontalLineTo(5f)
            verticalLineTo(2.75f)
            curveTo(5f, 1.784f, 5.784f, 1f, 6.75f, 1f)
            horizontalLineToRelative(2.5f)
            close()
            moveToRelative(-2.5f, 1f)
            curveTo(6.336f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(2.75f)
            curveTo(10f, 2.336f, 9.664f, 2f, 9.25f, 2f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}

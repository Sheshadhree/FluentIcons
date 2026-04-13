package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Organization12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Organization12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4.937f)
            curveTo(4.637f, 4.715f, 4f, 3.932f, 4f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.932f, -0.637f, 1.715f, -1.5f, 1.937f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1.063f)
            curveTo(10.363f, 8.285f, 11f, 9.068f, 11f, 10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            verticalLineTo(7f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(1.063f)
            curveTo(4.363f, 8.285f, 5f, 9.068f, 5f, 10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            verticalLineTo(4.937f)
            close()
        }
    }.build()
}

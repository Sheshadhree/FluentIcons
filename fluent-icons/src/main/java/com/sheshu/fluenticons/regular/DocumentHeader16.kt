package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentHeader16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentHeader16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            close()
            moveTo(4.75f, 1f)
            curveTo(3.784f, 1f, 3f, 1.784f, 3f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(3f, 14.216f, 3.784f, 15f, 4.75f, 15f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(13f, 1.784f, 12.216f, 1f, 11.25f, 1f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(4f, 2.75f)
            curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
            horizontalLineToRelative(6.5f)
            curveTo(11.664f, 2f, 12f, 2.336f, 12f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(4.336f, 14f, 4f, 13.664f, 4f, 13.25f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}

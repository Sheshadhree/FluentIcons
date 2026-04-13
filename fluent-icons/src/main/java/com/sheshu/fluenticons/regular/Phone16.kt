package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Phone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Phone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(6.724f, 13f, 7f, 13f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 12f, 9f, 12f)
            horizontalLineTo(7f)
            close()
            moveTo(5.75f, 1f)
            curveTo(4.784f, 1f, 4f, 1.784f, 4f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(4f, 14.216f, 4.784f, 15f, 5.75f, 15f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(12f, 1.784f, 11.216f, 1f, 10.25f, 1f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(5f, 2.75f)
            curveTo(5f, 2.336f, 5.336f, 2f, 5.75f, 2f)
            horizontalLineToRelative(4.5f)
            curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(5.336f, 14f, 5f, 13.664f, 5f, 13.25f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}

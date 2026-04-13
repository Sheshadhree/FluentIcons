package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LayoutAddAbove24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LayoutAddAbove24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.25f, 9f)
            curveTo(20.664f, 9f, 21f, 9.336f, 21f, 9.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineToRelative(-8f)
            curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
            horizontalLineToRelative(16.5f)
            close()
            moveTo(4.5f, 17.75f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(10.5f)
            horizontalLineToRelative(-15f)
            verticalLineToRelative(7.25f)
            close()
            moveTo(20.25f, 3f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            reflectiveCurveTo(20.664f, 4.5f, 20.25f, 4.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
            reflectiveCurveTo(3.336f, 3f, 3.75f, 3f)
            horizontalLineToRelative(16.5f)
            close()
        }
    }.build()
}

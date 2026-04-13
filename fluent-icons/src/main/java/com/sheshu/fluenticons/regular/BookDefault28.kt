package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookDefault28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookDefault28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 2.5f)
            curveTo(5.955f, 2.5f, 4.5f, 3.955f, 4.5f, 5.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(15f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(23.164f, 24f, 22.75f, 24f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.882f, 0f, -1.611f, -0.652f, -1.732f, -1.5f)
            horizontalLineTo(22.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-16f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineTo(7.75f)
            close()
            moveTo(22f, 21f)
            horizontalLineTo(6f)
            verticalLineTo(5.75f)
            curveTo(6f, 4.784f, 6.784f, 4f, 7.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(21.216f, 4f, 22f, 4.784f, 22f, 5.75f)
            verticalLineTo(21f)
            close()
            moveTo(9.25f, 6f)
            curveTo(8.56f, 6f, 8f, 6.56f, 8f, 7.25f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-2f)
            curveTo(20f, 6.56f, 19.44f, 6f, 18.75f, 6f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(9.5f, 9f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(9f)
            verticalLineTo(9f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}

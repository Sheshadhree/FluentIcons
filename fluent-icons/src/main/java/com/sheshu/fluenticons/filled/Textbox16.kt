package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Textbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Textbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(5f)
            curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
            reflectiveCurveTo(10.776f, 6f, 10.5f, 6f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 6f, 5f, 5.776f, 5f, 5.5f)
            reflectiveCurveTo(5.224f, 5f, 5.5f, 5f)
            close()
            moveToRelative(0f, 2.5f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 7.5f, 9f, 7.724f, 9f, 8f)
            reflectiveCurveTo(8.776f, 8.5f, 8.5f, 8.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.224f, 8.5f, 5f, 8.276f, 5f, 8f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveToRelative(0f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 11f, 10.5f, 11f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 11f, 5f, 10.776f, 5f, 10.5f)
            reflectiveCurveTo(5.224f, 10f, 5.5f, 10f)
            close()
        }
    }.build()
}

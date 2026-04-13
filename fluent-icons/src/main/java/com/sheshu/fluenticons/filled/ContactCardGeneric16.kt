package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContactCardGeneric16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContactCardGeneric16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.25f, 3f)
            curveTo(14.216f, 3f, 15f, 3.784f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 13f, 1f, 12.216f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
            horizontalLineToRelative(10.5f)
            close()
            moveTo(5.5f, 6f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(4f, 3f)
            curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-4f, -2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(4f, -1f)
            curveTo(9.224f, 6f, 9f, 6.224f, 9f, 6.5f)
            reflectiveCurveTo(9.224f, 7f, 9.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            reflectiveCurveTo(12.776f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}

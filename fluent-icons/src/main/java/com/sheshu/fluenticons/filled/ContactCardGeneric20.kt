package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContactCardGeneric20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContactCardGeneric20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            close()
            moveTo(7f, 7.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(8.38f, 7.5f, 7f, 7.5f)
            close()
            moveToRelative(4.5f, 3.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 11f, 14.5f, 11f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(7f, 8.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(7.828f, 11.5f, 7f, 11.5f)
            reflectiveCurveTo(5.5f, 10.828f, 5.5f, 10f)
            reflectiveCurveTo(6.172f, 8.5f, 7f, 8.5f)
            close()
            moveTo(11.5f, 8f)
            curveTo(11.224f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(11.224f, 9f, 11.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(14.776f, 9f, 15f, 8.776f, 15f, 8.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}

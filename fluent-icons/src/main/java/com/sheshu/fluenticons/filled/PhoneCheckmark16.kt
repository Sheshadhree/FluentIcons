package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 11f)
            curveToRelative(0.52f, 0f, 1.023f, -0.072f, 1.5f, -0.207f)
            verticalLineToRelative(2.457f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(4.784f, 15f, 4f, 14.216f, 4f, 13.25f)
            verticalLineTo(2.75f)
            curveTo(4f, 1.784f, 4.784f, 1f, 5.75f, 1f)
            horizontalLineToRelative(1.587f)
            curveTo(5.923f, 1.995f, 5f, 3.64f, 5f, 5.5f)
            curveTo(5f, 8.538f, 7.462f, 11f, 10.5f, 11f)
            close()
            moveTo(7f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(6.724f, 13f, 7f, 13f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 12f, 9f, 12f)
            horizontalLineTo(7f)
            close()
            moveToRelative(8f, -6.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 7.985f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 1f, 10.5f, 1f)
            reflectiveCurveTo(15f, 3.015f, 15f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(9.5f, 6.293f)
            lineTo(8.854f, 5.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}

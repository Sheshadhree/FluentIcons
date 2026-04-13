package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneChat16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneChat16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2.75f)
            curveTo(4f, 1.784f, 4.784f, 1f, 5.75f, 1f)
            horizontalLineToRelative(4.5f)
            curveTo(11.216f, 1f, 12f, 1.784f, 12f, 2.75f)
            verticalLineToRelative(3.272f)
            curveTo(11.835f, 6.008f, 11.668f, 6f, 11.5f, 6f)
            curveTo(8.462f, 6f, 6f, 8.462f, 6f, 11.5f)
            curveToRelative(0f, 0.81f, 0.175f, 1.58f, 0.49f, 2.273f)
            lineTo(6.117f, 15f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 15f, 4f, 14.216f, 4f, 13.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(11.5f, 16f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(13.985f, 7f, 11.5f, 7f)
            reflectiveCurveTo(7f, 9.015f, 7f, 11.5f)
            curveToRelative(0f, 0.792f, 0.205f, 1.536f, 0.564f, 2.182f)
            lineToRelative(-0.545f, 1.789f)
            curveToRelative(-0.095f, 0.313f, 0.197f, 0.605f, 0.51f, 0.51f)
            lineToRelative(1.79f, -0.544f)
            curveTo(9.965f, 15.796f, 10.709f, 16f, 11.5f, 16f)
            close()
            moveTo(9f, 10.5f)
            curveTo(9f, 10.224f, 9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 11f, 9f, 10.776f, 9f, 10.5f)
            close()
            moveTo(9.5f, 13f)
            curveTo(9.224f, 13f, 9f, 12.776f, 9f, 12.5f)
            reflectiveCurveTo(9.224f, 12f, 9.5f, 12f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

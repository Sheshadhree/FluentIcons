package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonClock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonClock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, 1.803f, 1.555f, 3.653f, 4.222f, 3.957f)
            curveTo(5.458f, 13.012f, 5f, 11.809f, 5f, 10.5f)
            curveTo(5f, 9.6f, 5.216f, 8.75f, 5.6f, 8f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 8f, 2f, 8.672f, 2f, 9.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(4.327f, -3.083f)
            curveTo(7.156f, 5.952f, 8.313f, 5.28f, 9.626f, 5.07f)
            curveTo(9.706f, 4.81f, 9.75f, 4.535f, 9.75f, 4.25f)
            curveTo(9.75f, 2.731f, 8.519f, 1.5f, 7f, 1.5f)
            reflectiveCurveTo(4.25f, 2.731f, 4.25f, 4.25f)
            curveToRelative(0f, 1.287f, 0.884f, 2.367f, 2.077f, 2.667f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveTo(10.5f, 8f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.276f, 10f, 12f, 10f)
            horizontalLineToRelative(-1f)
            verticalLineTo(8.5f)
            curveTo(11f, 8.224f, 10.776f, 8f, 10.5f, 8f)
            close()
        }
    }.build()
}

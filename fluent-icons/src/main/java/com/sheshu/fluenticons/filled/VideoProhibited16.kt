package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveTo(9.88f, 2.5f, 11f, 3.62f, 11f, 5f)
            verticalLineToRelative(1.022f)
            curveTo(8.197f, 6.275f, 6f, 8.631f, 6f, 11.5f)
            curveToRelative(0f, 0.706f, 0.133f, 1.38f, 0.375f, 2f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 13.5f, 1f, 12.38f, 1f, 11f)
            verticalLineTo(5f)
            close()
            moveToRelative(11f, 1.022f)
            curveToRelative(1.134f, 0.103f, 2.17f, 0.55f, 3f, 1.235f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.421f, -0.49f, -0.654f, -0.816f, -0.387f)
            lineTo(12f, 5.892f)
            verticalLineToRelative(0.13f)
            close()
            moveTo(7f, 11.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(13.985f, 7f, 11.5f, 7f)
            reflectiveCurveTo(7f, 9.015f, 7f, 11.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(8f, 9.567f, 9.567f, 8f, 11.5f, 8f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(8.26f, 13.011f, 8f, 12.286f, 8f, 11.5f)
            close()
            moveToRelative(3.5f, 3.5f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            lineToRelative(4.9f, -4.9f)
            curveTo(14.74f, 9.989f, 15f, 10.714f, 15f, 11.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.build()
}

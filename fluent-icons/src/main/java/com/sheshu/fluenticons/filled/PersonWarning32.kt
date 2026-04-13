package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonWarning32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonWarning32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveToRelative(1.784f, 1.136f, 4.086f, 1.894f, 6.622f, 2.13f)
            curveToRelative(-0.415f, -0.93f, -0.435f, -2.042f, 0.107f, -3.064f)
            lineTo(19.116f, 18f)
            horizontalLineTo(7.5f)
            close()
            moveToRelative(14.238f, -1.74f)
            lineTo(15.74f, 27.562f)
            curveToRelative(-0.707f, 1.333f, 0.259f, 2.938f, 1.767f, 2.938f)
            horizontalLineToRelative(10.988f)
            curveToRelative(1.509f, 0f, 2.474f, -1.605f, 1.767f, -2.938f)
            lineTo(24.264f, 16.26f)
            curveToRelative(-0.537f, -1.013f, -1.988f, -1.013f, -2.526f, 0f)
            close()
            moveToRelative(2.013f, 3.49f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveToRelative(0.25f, 8.25f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}

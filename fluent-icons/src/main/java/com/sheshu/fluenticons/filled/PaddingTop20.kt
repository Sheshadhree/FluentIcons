package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaddingTop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaddingTop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2.75f)
            curveTo(3.75f, 2.336f, 4.086f, 2f, 4.5f, 2f)
            horizontalLineToRelative(1.313f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(6.226f, 3.5f, 5.813f, 3.5f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(3.938f, 0f)
            curveTo(7.688f, 2.336f, 8.023f, 2f, 8.438f, 2f)
            horizontalLineToRelative(2.624f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.335f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8.438f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(5.25f, 0f)
            curveToRelative(0f, -0.414f, 0.335f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(15f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(15.414f, 3.5f, 15f, 3.5f)
            horizontalLineToRelative(-1.313f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveTo(3.75f, 17.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(15f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(15.414f, 18f, 15f, 18f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(6.53f, -12.53f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(4.97f, 8.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(9f, 7.06f)
            verticalLineToRelative(7.19f)
            curveTo(9f, 14.664f, 9.336f, 15f, 9.75f, 15f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(7.06f)
            lineToRelative(2.97f, 2.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.25f, -4.25f)
            close()
        }
    }.build()
}

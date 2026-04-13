package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowMinimize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMinimize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.78f, 3.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(10.5f, 4.44f)
            verticalLineTo(3.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9f, 2.836f, 9f, 3.25f)
            verticalLineToRelative(2.9f)
            curveToRelative(0f, 0.017f, 0f, 0.035f, 0.002f, 0.052f)
            curveTo(8.988f, 6.409f, 9.06f, 6.622f, 9.22f, 6.78f)
            curveToRelative(0.158f, 0.16f, 0.37f, 0.232f, 0.578f, 0.218f)
            curveTo(9.815f, 7f, 9.833f, 7f, 9.85f, 7f)
            horizontalLineToRelative(2.9f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.164f, 5.5f, 12.75f, 5.5f)
            horizontalLineToRelative(-1.19f)
            lineToRelative(2.22f, -2.22f)
            close()
            moveTo(6.25f, 13.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-1.19f)
            lineToRelative(-2.22f, 2.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.22f, -2.22f)
            horizontalLineTo(3.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(2.836f, 9f, 3.25f, 9f)
            horizontalLineToRelative(2.9f)
            curveToRelative(0.017f, 0f, 0.035f, 0f, 0.052f, 0.002f)
            curveTo(6.409f, 8.988f, 6.622f, 9.06f, 6.78f, 9.22f)
            curveToRelative(0.16f, 0.158f, 0.232f, 0.37f, 0.218f, 0.578f)
            curveTo(7f, 9.815f, 7f, 9.833f, 7f, 9.85f)
            verticalLineToRelative(2.9f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExportLtr16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportLtr16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.75f, 3f)
            curveTo(2.164f, 3f, 2.5f, 3.336f, 2.5f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(2.5f, 12.664f, 2.164f, 13f, 1.75f, 13f)
            reflectiveCurveTo(1f, 12.664f, 1f, 12.25f)
            verticalLineToRelative(-8.5f)
            curveTo(1f, 3.336f, 1.336f, 3f, 1.75f, 3f)
            close()
            moveToRelative(8.47f, 0.72f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.22f, -2.22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 8.5f, 4f, 8.164f, 4f, 7.75f)
            reflectiveCurveTo(4.336f, 7f, 4.75f, 7f)
            horizontalLineToRelative(7.69f)
            lineToRelative(-2.22f, -2.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
